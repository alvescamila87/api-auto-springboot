function getAutos() {

    const timeoutMilliseconds = 300;
    const timeoutPromise = new Promise((resolve) => setTimeout(resolve, timeoutMilliseconds));

    document.getElementById('spinner').style.display = 'block';

    var apiURL = 'https://auto-example-api.s3.us-east-2.amazonaws.com/autos.json';

    fetch(apiURL)
        .then(response => response.json())
        .then(data => showAutos(data))
        .catch(error => console.error('Search error: ', error))
        .finally(() => {
            document.getElementById('spinner').style.display = 'none';
        });
}

function showAutos(result) {
    console.log('Result: ', result);

    var resultAutos = document.getElementById('result');
    resultAutos.innerHTML = '<h4> Autos for Sale </h4>';

    result.forEach(auto => {
        var autoInfo = document.createElement('div');

        autoInfo.innerHTML += 
        '<p>Brand: ' + auto.brand + '</p>' +
        '<p>Model: ' + auto.model + '</p>' +
        '<p>Price: ' + auto.priceInCents + '</p>';

        resultAutos.appendChild(autoInfo);
    });

}