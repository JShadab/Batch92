
const url = 'http://localhost:9191/api/train';

async function callApi() {
    let response = await fetch(url);
    let jsonStr = await response.text();
    console.log(jsonStr);

    createTable(jsonStr);
}

function createTable(jsonStr) {

    const jsonObj = JSON.parse(jsonStr);

    //  const data = jsonObj.data;
    const data = jsonObj;

    const tableBody = document.getElementById('table_body')

    for (let x in data) {

        let obj = data[x];

        const row = document.createElement('tr');

        const cell1 = document.createElement('td');
        cell1.innerHTML = obj.trainNo;
        const cell2 = document.createElement('td');
        cell2.innerHTML = obj.trainName;
        const cell3 = document.createElement('td');
        cell3.innerHTML = obj.source;
        const cell4 = document.createElement('td');
        cell4.innerHTML = obj.destination;
        const cell5 = document.createElement('td');
        cell5.innerHTML = obj.ticketPrice;

        const cell6 = document.createElement('td');
        const btnBook = document.createElement('button');
        btnBook.classList.add('btn', 'btn-primary');
        btnBook.innerHTML = 'Book';

        const btnEdit = document.createElement('button');
        btnEdit.innerHTML = 'Edit';
        btnEdit.classList.add('btn', 'btn-success');
        btnEdit.innerHTML = 'Edit';

        const btnDelete = document.createElement('button');
        btnDelete.classList.add('btn', 'btn-danger');
        btnDelete.innerHTML = 'Delete';

        cell6.appendChild(btnBook);
        cell6.appendChild(btnEdit);
        cell6.appendChild(btnDelete);

        row.appendChild(cell1);
        row.appendChild(cell2);
        row.appendChild(cell3);
        row.appendChild(cell4);
        row.appendChild(cell5);
        row.appendChild(cell6);


        tableBody.appendChild(row);
    }
}

callApi();