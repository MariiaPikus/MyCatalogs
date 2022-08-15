import React from 'react';
import CollectService from '../Service/CollectService';

class CollectComponent extends React.Component {

    constructor(props) {
        super(props)
        this.state = {
            collects: []
        }
        console.log(props)
    }

    componentDidMount() {
        CollectService.getCollect().then((response) => {
            this.setState({ collects: response.data })
        });
    }

    render() {
        return (
            <div>
                <h1> List</h1>
                <table>
                    <thead>
                        <tr>

                            <td> Id</td>
                            <td> Name</td>
                            <td> Description</td>
                            <td> Topic</td>
                            <td> Condition1</td>
                            <td> Condition2</td>
                        </tr>

                    </thead>
                    <tbody>
                        {
                            this.state.collects.map(
                                collect =>
                                    <tr key={collect.id}>
                                        <td> {collect.id}</td>
                                        <td> {collect.name}</td>
                                        <td> {collect.description}</td>
                                        <td> {collect.topic}</td>
                                        <td> {collect.condition1}</td>
                                        <td> {collect.condition2}</td>
                                    </tr>
                            )
                        }

                    </tbody>
                </table>

            </div>

        )
    }
}

export default CollectComponent