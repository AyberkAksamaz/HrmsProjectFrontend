import React, {  } from 'react'
import { Button,  Header, Menu } from 'semantic-ui-react'


export default function HomeNavi() {
    return (
        <div>
            <Menu size='large'>
                <Menu.Item>
                    <Header
                        size="huge"
                        color="green"
                        className="orbitron"
                        icon="certificate"
                        content="CompanyName"
                    />
                </Menu.Item>
                <Menu.Item
                    icon="circle"
                    name='Jobs'
                />
                <Menu.Item
                    name='Companies'
                />
                <Menu.Menu position='right'>
                    <Menu.Item
                        name='For Employers'
                    />
                    <Menu.Item
                        name='Post Jobs'
                    />
                    <Menu.Item>
                        <Button primary>Sign In</Button>
                    </Menu.Item>
                </Menu.Menu>       
            </Menu>
        </div>
    )
}
