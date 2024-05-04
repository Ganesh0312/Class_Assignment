import React, { useState } from "react";

function Employee() {
  const [employees, setEmployees] = useState([
    { id: 1, name: "John Doe", position: "Manager" },
    { id: 2, name: "Jane Smith", position: "Developer" },
    { id: 3, name: "Tom Johnson", position: "Designer" },
  ]);

  const [newEmployeeName, setNewEmployeeName] = useState("");
  const [newEmployeePosition, setNewEmployeePosition] = useState("");

  const handleAddEmployee = () => {
    const newEmployee = {
      id: Math.floor(Math.random() * 10),
      name: newEmployeeName,
      position: newEmployeePosition,
    };
    setEmployees([...employees, newEmployee]);
    setNewEmployeeName("");
    setNewEmployeePosition("");
  };

  const handleDeleteEmployee = (id) => {
    const updatedEmployees = employees.filter((employee) => employee.id !== id);
    setEmployees(updatedEmployees);
  };

  return (
    <div>
      <h2>Employee Table</h2>
      <table>
        <thead>
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Position</th>
            <th>Action</th>
          </tr>
        </thead>
        <tbody>
          {employees.map((employee) => (
            <tr key={employee.id}>
              <td>{employee.id}</td>
              <td>{employee.name}</td>
              <td>{employee.position}</td>
              <td>
                <button onClick={() => handleDeleteEmployee(employee.id)}>
                  Delete
                </button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
      <div>
        <h2>Add Employee</h2>
        <input
          type="text"
          placeholder="Name"
          value={newEmployeeName}
          onChange={(e) => setNewEmployeeName(e.target.value)}
        />
        <input
          type="text"
          placeholder="Position"
          value={newEmployeePosition}
          onChange={(e) => setNewEmployeePosition(e.target.value)}
        />
        <button onClick={handleAddEmployee}>Add Employee</button>
      </div>
    </div>
  );
}

export default Employee;
