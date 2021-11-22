import { Component } from 'react';
import { Formik, Form, Field } from 'formik';
import Swal from 'sweetalert2';
import apiViaCep from '../../../../routes/service/';
import './App.css';

export default class Cep extends Component {
  constructor() {
    super();
    this.state = {
      enderecos: []
    }
  }

  handleSubmit = async ({ cep }) => {
    try {
        const response = await api.get(`ws/${cep}/json/`);
        this.setState({ enderecos: response.data });
      } catch (error) {
        Swal.fire({
          title: error.response.status,
          icon: 'error',
          text: error.response.statusText
        })
      }
    
  }
  render() {
    return (
      <>
        <main>
          <div className="col-md-4 offset-md-4 col-sm-8 offset-sm-2 my-3 container text-center">
            <h2>Procura Endereço pelo Cep</h2>
            <Formik initialValues={{ cep: '' }} onSubmit={this.handleSubmit}>
              <Form>
                <Field placeholder="Insira o Cep" required type="text" name="cep" id="cep" className="form-control" />
                <button className="btn btn-primary my-4" type="submit">Pesquisar</button>
              </Form>
            </Formik>
          </div>
          <div className="col-md-4 offset-md-4 col-sm-8 offset-sm-2 my-3 container text-center">
            {console.log(this.state.enderecos)}
            <p>{this.state.enderecos.logradouro}</p>
            <p>{this.state.enderecos.complemento}</p>
            <p>{this.state.enderecos.bairro}</p>
            <p>{this.state.enderecos.localidade}</p>
            <p>{this.state.enderecos.uf}</p>
          </div>
        </main>
      </>
    );
  }
}