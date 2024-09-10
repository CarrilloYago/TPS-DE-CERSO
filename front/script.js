document.addEventListener("DOMContentLoaded", function () {
    
    const API_URL = "https://api-product-g1pw.onrender.com/api/products"; // Reemplaza con la URL de tu API

    const productForm = document.getElementById("productForm");
    const productTableBody = document.getElementById("productTableBody");
    
    
    const fetchProducts = async () => {
        const response = await fetch(API_URL);
        const products = await response.json();
        console.log(products);
        renderProducts(products);
    };

    const renderProducts = (products) => {
        productTableBody.innerHTML = "";
        products.forEach(product => {
            const row = document.createElement("tr");
            row.innerHTML = `
                <td>${product.id}</td>
                <td>${product.name}</td>
                <td>${product.price}</td>
                <td>${product.quantity}</td>
                <td>
                    <button class="btn btn-warning btn-sm" onclick="editProduct(${product.id})">Editar</button>
                    <button class="btn btn-danger btn-sm" onclick="deleteProduct(${product.id})">Eliminar</button>
                </td>
            `;
            productTableBody.appendChild(row);
        });
    };

    const saveProduct = async (product) => {
        console.log(product);
        const url = product.id ? `${API_URL}/${product.id}` : API_URL;
        const method = product.id ? "PUT" : "POST";
        
        const response = await fetch(url, {
            method: method,
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify(product),
        });
        
        if (response.ok) {
            fetchProducts(); // Actualiza la lista de productos después de guardar
        } else {
            console.error("Error al guardar el producto:", response.statusText);
        }
    };

    window.deleteProduct = async (id) => {
        console.log(id);
        const response = await fetch(`${API_URL}/${id}`, {
            method: "DELETE",
        });
        
        if (response.ok) {
            fetchProducts(); // Actualiza la lista de productos después de eliminar
        } else {
            console.error("Error al eliminar el producto:", response.statusText);
        }
    };

    window.editProduct = async (id) => {
        const response = await fetch(`${API_URL}/${id}`);
        const product = await response.json();
        document.getElementById("productId").value = product.id;
        document.getElementById("name").value = product.name;
        document.getElementById("price").value = product.price;
        document.getElementById("quantity").value = product.quantity;
        $('#productModal').modal('show');
    };

    productForm.addEventListener("submit", function (event) {
        event.preventDefault();
        const product = {
            id: document.getElementById("productId").value,
            name: document.getElementById("name").value,
            price: document.getElementById("price").value,
            quantity: document.getElementById("quantity").value,
        };
        saveProduct(product);
        $('#productModal').modal('hide');
        productForm.reset();
    });

    fetchProducts();
});