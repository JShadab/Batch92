function gettrains(){

    const data=[
        {
            "Train_No":"1234",
            "Train_Name":"Chennai Express",
            "Source":"Chennai",
            "Destination":"Kolkata",
            "Ticket_Fare":2500
        },
        {
            "Train_No":"1235",
            "Train_Name":"Shatabdi Express",
            "Source":"Bangalore",
            "Destination":"Chennai",
            "Ticket_Fare":2800
        },
        {
            "Train_No":"1236",
            "Train_Name":"Patna Express",
            "Source":"Patna",
            "Destination":"Chennai Central",
            "Ticket_Fare":1800
        }
    ];

    const div=document.getElementById("train_details");

    const table=document.createElement('table')

    const headrow=document.createElement('tr')

    const cell=document.createElement('th')
    cell.innerHTML="Train No"
    headrow.appendChild(cell);
    const cell1=document.createElement('th')
    cell.innerHTML="Teain Name";
    headrow.appendChild(cell1);
    const cell2=document.createElement('th')
    cell.innerHTML="Source";
    headrow.appendChild(cell2);
    const cell3=document.createElement('th')
    cell.innerHTML="Destination";
    headrow.appendChild(cell3);
    const cell4=document.createElement('th')
    cell.innerHTML="Ticket Fare";
    headrow.appendChild(cell4);

    table.appendChild(headrow);

    for(let x in data){
        
        let obj=data[x];
        
        const headrow=document.createElement('tr');
        const cell1 = document.createElement('td');
        cell1.innerHTML = obj.Train_No;
        const cell2 = document.createElement('td');
        cell2.innerHTML = obj.Train_Name;
        const cell3 = document.createElement('td');
        cell3.innerHTML = obj.Source;
        const cell4 = document.createElement('td');
        cell3.innerHTML = obj.Destination;
        const cell5 = document.createElement('td');
        cell3.innerHTML = obj.Ticket_Fare;


        headrow.appendChild(cell1);
        headrow.appendChild(cell2);
        headrow.appendChild(cell3);
        headrow.appendChild(cell4);
        headrow.appendChild(cell5);

        table.appendChild(headrow);
    }

    div.appendChild(table);

    table.classList.add("table");
    table.classList.add("table-striped");
}