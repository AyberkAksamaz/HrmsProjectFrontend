import React, { useState, useEffect } from 'react'
import { useParams } from 'react-router'
import { Card, Image, Button } from 'semantic-ui-react'
import JobsService from '../Services/jobsService'

export default function JobsListDetail() {
    let { id } = useParams()

    const [job, setJob] = useState({})

    useEffect(() => {
        let jobsService = new JobsService()
        jobsService.getByPositionId(id).then(result => setJob(result.data.data))
    }, []);

    return (
        <div>
            No : {id}
            <Card.Group style={{ marginLeft: '38em' }}>
                <Card>
                    <Card.Content>
                        <Image
                            floated='right'
                            size='mini'
                            src='https://react.semantic-ui.com/images/avatar/large/steve.jpg'
                        />
                        <Card.Header>{job.city?.cityName}</Card.Header>
                        <Card.Meta>Friends of Elliot</Card.Meta>
                        <Card.Description>
                            Steve wants to add you to the group <strong>best friends</strong>
                        </Card.Description>
                    </Card.Content>
                    <Card.Content extra>
                        <div className='ui two buttons'>
                            <Button basic color='green'>
                                Approve
                            </Button>
                            <Button basic color='red'>
                                Decline
                            </Button>
                        </div>
                    </Card.Content>
                </Card>
            </Card.Group>
        </div>
    )
}
