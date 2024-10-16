const axios = require('axios');

// Make an HTTP GET request to a public API
axios.get('https://jsonplaceholder.typicode.com/posts/2')
  .then(response => {
    console.log('Data:', response.data);
  })
  .catch(error => {
    console.error('Error:', error);
  });