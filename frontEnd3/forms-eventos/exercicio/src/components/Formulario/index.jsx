import { Component } from 'react';
import { Formik, Form, Field } from 'formik';
import Swal from 'sweetalert2';
import './style.scss';


export default class Formulario extends Component {
    envioForm = ({ nome, telefone, email }) => {
        if(nome === ''){
            Swal.fire({
                title: 'ERRO!!!',
                icon: 'error',
                text: 'Ei cara, NOME não pode estar vazio!!'
            })
        }else if(telefone === ''){
            Swal.fire({
                title: 'ERRO!!!',
                icon: 'error',
                text: 'Ei cara, TELEFONE não pode estar vazio!!'
            })
        }else if(email === ''){
            Swal.fire({
                title: 'ERRO!!!',
                icon: 'error',
                text: 'Ei cara, EMAIL não pode estar vazio!!'
            })
        }else{
            console.log("Validou e enviou!");
            Swal.fire({
                title: '<strong>Formulário Enviado!</u></strong>',
                icon: 'success',
                html:
                  'Nome: '+nome+
                  '<br>Email: ' +email+
                  '<br>Telefone: ' +telefone,
                showCloseButton: true,
                focusConfirm: true,
                confirmButtonText:
                  '<i class="fa fa-thumbs-up"></i> Feito!',
                confirmButtonAriaLabel: 'Thumbs up, great!',
                
              })
        }
        
        
    }

    render() {
        return (
            <div id="formulario">
                <Formik initialValues={{ nome: '', telefone: '', email: '' }} onSubmit={this.envioForm}>
                    <Form>
                        <Field type="text" id="nome" name="nome" className="form-control"/>
                        <Field type="text" id="telefone" name="telefone" className="form-control"/>
                        <Field type="email" id="email" name="email" className="form-control"/>
                        <button className="btn" type="submit">
                            Enviar
                        </button>
                    </Form>
                </Formik>
            </div>
        )
    }
}