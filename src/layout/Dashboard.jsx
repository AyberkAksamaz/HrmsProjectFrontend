import React from 'react'
import { Route } from 'react-router'
import HomePage from '../pages/HomePage'
import JobsDetailPage from '../pages/JobsDetailPage'
import JobsListPage from '../pages/JobsListPage'
import HomeNavi from './HomeNavi'
import JobAdd from './JobAdd'




export default function Dashboard() {
    return (
        <div>
            <HomeNavi/>
            <Route exact path="/" component={HomePage} />
            <Route exact path="/home" component={HomePage} />
            <Route exact path="/jobs/" component={JobsListPage} />
            <Route exact path="/jobs/:id" component={JobsDetailPage} />
            <Route exact path="/job/Add" component={JobAdd} />
        </div>
    )
}
