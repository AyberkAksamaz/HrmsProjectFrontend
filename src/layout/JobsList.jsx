import React, { useState, useEffect } from 'react'
import { Card } from 'semantic-ui-react'
import JobsService from '../Services/jobsService'

export default function JobsList() {

    const [jobs, setJobs] = useState([])

    useEffect(() =>{
        let jobsService = new JobsService()
        jobsService.getJobs().then(result => setJobs(result.data.data))
    }, []);

    return (
        <div>
            <Card.Group>
                {
                     jobs.map((job) => (
                        <Card>
                            <Card.Content>
                                <Card.Header>{job.jobDescription}</Card.Header>
                                <Card.Meta>{job.city?.cityName}</Card.Meta>
                                <Card.Description>
                                    Matthew is a pianist living in Nashville.
                                </Card.Description>
                            </Card.Content>
                        </Card>
                     ))
                }
            </Card.Group>
        </div>
    )
}
