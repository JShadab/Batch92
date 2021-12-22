function createTable() {

    const data = [
        {
            "name": "Shadab",
            "age": 35,
            "salary": 1234.5
        },
        {
            "name": "Lala",
            "age": 36,
            "salary": 98765.5
        },
        {
            "name": "Praveen",
            "age": 30,
            "salary": 27600.5
        }
    ];


    const div = document.getElementById('root');

    const table = document.createElement('table');

    const headerRow = document.createElement('tr');

    const headerCell1 = document.createElement('th');
    headerCell1.innerHTML = "NAME";
    const headerCell2 = document.createElement('th');
    headerCell2.innerHTML = "AGE";
    const headerCell3 = document.createElement('th');
    headerCell3.innerHTML = "SALARY";

    headerRow.appendChild(headerCell1);
    headerRow.appendChild(headerCell2);
    headerRow.appendChild(headerCell3);

    table.appendChild(headerRow);

    for (let index in data) {

        let obj = data[index];

        const row = document.createElement('tr');

        const cell1 = document.createElement('td');
        cell1.innerHTML = obj.name;
        const cell2 = document.createElement('td');
        cell2.innerHTML = obj.age;
        const cell3 = document.createElement('td');
        cell3.innerHTML = obj.salary;

        row.appendChild(cell1);
        row.appendChild(cell2);
        row.appendChild(cell3);

        table.appendChild(row);
    }

    div.appendChild(table);

    table.classList.add("table");
    table.classList.add("table-striped");

}

//createTable();