const URL = "http://localhost:8080/api/user/cart";
const productsContainer = document.getElementById("productsContainer");

function getProducts() {
	options = {
		method: "GET",
		headers: {"Content-Type": "application/json"},
	};

	let data;

	fetch(URL, options).then((response) => response.json());
	then((json) => {
		console.log(json);
		data = json;
	});

	return data;
}

function showProducts() {
	let products = getProducts();
	console.log(products);
	products.forEach((product) => {
		let productDiv = document.createElement("col-sm-6");
		productDiv.className = "product";
		productDiv.innerHTML = `
      <div class="card">
        <div class="card-body">
          <h5 class="card-title">Nombre Producto</h5>
          <p class="card-text">Descripción Producto</p>
          <p class="card-text">Precio Producto</p>
          <button class="btn btn-primary">Agregar Carrito</button>
        </div>
      </div>
    `;
		productsContainer.appendChild(productDiv);
	});
}
