const URL = "http://localhost:8080/api/product";
const productsContainer = document.getElementById("productsContainer");

function addToCart(productId) {
	console.log(productId);
	options = {
		method: "POST",
		headers: {"Content-Type": "application/json"},
		body: JSON.stringify({productId: productId}),
	};

	fetch(URL, options)
		.then((response) => response.json())
		.then((json) => {
			console.log(json);
			products = json;
		});
}

function showProducts() {
	let products;

	fetch(URL)
		.then((response) => response.json())
		.then((json) => {
			console.log(json);
			products = json;

			// corte de codigo
			products.forEach((product) => {
				let productDiv = document.createElement("div");
				productDiv.className = "col-sm-6";
				productDiv.innerHTML = `
      <div class="card">
        <div class="card-body">
          <h5 class="card-title">${product.name}</h5>
          <p class="card-text">${product.description}</p>
          <p class="card-text">Precio Producto</p>
          <button class="btn btn-primary" onClick="addToCart(${product.productId})">Agregar Carrito</button>
        </div>
      </div>
    `;
				productsContainer.appendChild(productDiv);
			});
			// corte de codigo
		});
}

window.onload = function () {
	showProducts();
};
