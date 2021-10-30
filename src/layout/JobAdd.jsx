import { Field, Form, Formik } from 'formik'
import React from 'react'
import { Button, FormField } from 'semantic-ui-react'
import * as Yup from "yup"
import JobsService from '../Services/jobsService'

export default function JobAdd() {

    const initialVAlues = {
        cityName: "",
        companyName: "",
        jobDescription: 'Lorem ipsum dolor sit amet consectetur, adipisicing elit. Voluptates blanditiis earum, fugiat ipsam ad accusantium repellat aliquam cupiditate ipsum voluptas totam dolorum nam quasi repudiandae! Maxime modi consequuntur sint iste?',
        jobName: "",
        // releaseDate: "",
        // applicationDeadline: "",

    }

    const shema = Yup.object({
        cityName: Yup.string().required("City Name required!"),
        companyName: Yup.string().required("Company Name required!"),
        jobDescription: Yup.string().required("jobDescription required!"),
        jobName: Yup.string().required("Job Name required!"),
        // releaseDate: Yup.date().required("Release Date required!"),
        // applicationDeadline: Yup.date().required("Application Deadline required!")
    })
    return (
        <div className='JobAddForm'>
            <Formik
                initialValues={initialVAlues}
                validationSchema={shema}
                onSubmit={(values) => {
                    let jobsService = new JobsService()
                    jobsService.addJob(values).then(result => console.log(values))
                }}
            >
                <Form className='ui form'>
                    <FormField>
                        <label>Job Name</label>
                        <Field name='jobName' placeholder='Job Name'></Field>
                    </FormField>
                    <FormField>
                        <label>Job Description</label>
                        <Field name='jobDescription' placeholder='Job Descriptiob'></Field>
                    </FormField>
                    <FormField>
                        <label>Company Name</label>
                        <Field name='companyName' placeholder='Company Name'></Field>
                    </FormField>
                    <FormField>
                        <label>City Name</label>
                        <Field name='cityName' placeholder='City Name'></Field>
                    </FormField>
                    {/* <FormField>
                        <label>Release Date</label>
                        <Field name=' releaseDate' placeholder='Release Date'></Field>
                    </FormField>
                    <FormField>
                        <label>Application Deadline</label>
                        <Field name='applicationDeadline' placeholder='Application Deadline'></Field>
                    </FormField> */}
                    <Button color='green' type='submit'>Post Job</Button>
                </Form>
            </Formik>
        </div>
    )
}
