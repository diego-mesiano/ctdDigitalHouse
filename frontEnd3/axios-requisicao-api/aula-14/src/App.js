import { Component } from 'react';
import { Formik, Form, Field } from 'formik';
import Swal from 'sweetalert2';
import api from './services/api';
import './App.scss';

export default class App extends Component {
  constructor() {
    super();
    this.state = {
      repositorios: []
    }
  }

  handleSubmit = async ({ nomeUsuario }) => {
    if (nomeUsuario) {
      try {
        const response = await api.get(`https://api.github.com/users/${nomeUsuario}/repos`);
        this.setState({ repositorios: response.data });
      } catch (error) {
        Swal.fire({
          title: error.response.status,
          icon: 'error',
          text: error.response.statusText
        })
      }
    }
  }

  render() {
    return (
      <>
        <main>
          <div className="col-md-4 offset-md-4 col-sm-8 offset-sm-2 my-3 container text-center">
            <h2>Procure um usuário do Github</h2>
            <Formik initialValues={{ nomeUsuario: '' }} onSubmit={this.handleSubmit}>
              <Form>
                <Field placeholder="Insira o nome do usuário" required type="text" name="nomeUsuario" id="nomeUsuario" className="form-control" />
                <button className="btn btn-primary my-4" type="submit">Pesquisar</button>
              </Form>
            </Formik>
            {this.state.repositorios.length > 0 && (
              <>
                <ul>
                  {this.state.repositorios.map(({ id, name, html_url }) => {
                    return (
                      <li key={id}>
                        <a target="_blank" href={html_url} rel="noreferrer">
                          {name}
                        </a>
                      </li>
                    );
                  })}
                </ul>
              </>
            )}
          </div>
        </main>
      </>
    );
  }
}