import { Component } from 'react';


export default class App extends Component {
    constructor(props) {
        super(props);
        this.state = { cronometro: 60 };
    }

    componentDidMount() {
        this.cr = setInterval(
            () => this.tick(),
            1000
        );
    }

    componentDidUpdate() {
        if (this.state.cronometro <= 0) {
            console.log("Entrou")
            clearInterval(this.cr);
        }
    }

    tick() {
        this.setState({ cronometro: this.state.cronometro - 1 });
    }

    render() {

        console.log(this.state.cronometro)
        return (
            <div className="d-flex flex-wrap flex-column justify-content-center align-items-center py-3 my-4" >
                <h2>{this.state.cronometro}</h2>
            </div>
        );
    }
}