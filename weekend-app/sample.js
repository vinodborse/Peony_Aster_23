// fetch(url,{method: 'POST',body: {
//     "name": "Don",
//     "address": "Pune",
//     "dept": "ADMIN",
//     "age": 21
// }})


$('#search-id').click(function () { 
    getEmployee();
    
});

async function getEmployee() {
    const empId = $('#emp-id').val();

    const url = "http://localhost:8080/api/employee/get?empId="+empId;
    const fetchResult = await fetch(url, {method: 'GET'});
    const finalResult = await fetchResult.json();

    $('#result-div').html("<h1>"+ finalResult.name +"</h1>");
}