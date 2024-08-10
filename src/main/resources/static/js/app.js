fetch(`/api/pets`)
.then(response => response.json())
.then(data => {
	let petslist = document.getElementById('pets-list');
	data.forEach(pet => {
		let petitem = document.createElement('div');
		petitem.textContent = `${pet.name} - ${pet.description} - ${pet.age} - ${pet.price}`;
		petslist.appendChild(petitem);
	});
})