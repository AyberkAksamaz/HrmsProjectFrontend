import React from 'react'
import { Button, Divider } from 'semantic-ui-react'

export default function HomeLoginPanel() {
    return (
        <div className='homeLoginPanel'>
            <h1>  Find The Job That Fits Your Life </h1>
            <p> By continuing, you agree to our Terms of Use and Privacy Policy.</p>
            <Button
                className='homeButton'
                color='facebook'
                icon="facebook f"
                content='Continue with Facebook'
                labelPosition = 'left'
            >
            </Button>
            <Button
                className='homeButton'
                color='google plus'
                icon="google"
                content='Continue with Google'
                labelPosition = 'left'
                tabIndex = '55'
            >
            </Button>
            <Divider  className='aaa' inverted horizontal>Or</Divider>
        </div>
    )
}
