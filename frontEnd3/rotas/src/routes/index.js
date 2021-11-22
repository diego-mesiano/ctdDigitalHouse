import { BrowserRouter, Routes, Route } from 'react-router-dom';
import {Cep} from '../pages/main/components/Cep'
import {Brasil} from '../pages/main/components/Brasil'



const RouteList = () => (
  <BrowserRouter>
    <Routes>
      <Route path="/consumir-via-cep" element={<Cep />} />
      <Route path="/consumir-brasil-api" element={<Brasil/>} />
    </Routes>
  </BrowserRouter>
);

export default RouteList;