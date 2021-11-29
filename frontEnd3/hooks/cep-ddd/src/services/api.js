import axios from 'axios';

export const apiCep = axios.create({
  baseURL: 'https://brasilapi.com.br/api/cep/v1/{cep}'
});

/*
{
  "cep": "89010025",
  "state": "SC",
  "city": "Blumenau",
  "neighborhood": "Centro",
  "street": "Rua Doutor Luiz de Freitas Melro",
  "service": "viacep",
  "location": {
    "type": "Point",
    "coordinates": {
      "longitude": "-49.0629788",
      "latitude": "-26.9244749"
    }
  }
}

*/

export const apiDDD = axios.create({
    baseURL: 'https://brasilapi.com.br/api/ddd/v1/{ddd}'
  });
/*
  {
    "state": "SP",
    "cities": [
    "EMBU",
    "VÁRZEA PAULISTA",
    "VARGEM GRANDE PAULISTA",
    "VARGEM",
    "TUIUTI",
    "TABOÃO DA SERRA",
    "SUZANO",
    "SÃO ROQUE",
    "SÃO PAULO"
    ]
    *}
*/
