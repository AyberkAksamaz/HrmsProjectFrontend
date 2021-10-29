import React from 'react'
import HomeLogin from '../layout/HomeLogin'
import HomeNavi from '../layout/HomeNavi'
import jobsListPage from './jobsListPage'





export default function HomePage() {
    return (
        <div >
            <HomeNavi/>
            <HomeLogin/>
            <jobsListPage/>
        </div>
    )
}
