const express = require('express');
const cors = require('cors');
const app = express();

app.use(cors()); // Habilita CORS para todas las rutas

app.listen(8080, () => {
  console.log('Servidor escuchando en el puerto 8080');
});