import React, { useState } from "react";

function Calculator() {
  const [expression, setExpression] = useState("");

  const handleButtonClick = (value) => {
    setExpression((prevExpression) => prevExpression + value);
  };

  const clearExpression = () => {
    setExpression("");
  };

  const evaluateExpression = () => {
    try {
      setExpression(eval(expression).toString());
    } catch (error) {
      setExpression("Error");
    }
  };

  return (
    <div className="bg-gray-100 min-h-screen flex justify-center items-center">
      <div className="bg-white p-8 rounded-lg shadow-lg">
        <input
          type="text"
          value={expression}
          readOnly
          className="w-full mb-4 p-2 rounded-md border border-gray-300 focus:outline-none focus:border-blue-500"
        />
        <div className="grid grid-cols-4 gap-2">
          <button onClick={() => handleButtonClick("1")} className="btn">
            1
          </button>
          <button onClick={() => handleButtonClick("2")} className="btn">
            2
          </button>
          <button onClick={() => handleButtonClick("3")} className="btn">
            3
          </button>
          <button
            onClick={() => handleButtonClick("+")}
            className="btn bg-blue-500 text-white"
          >
            +
          </button>
          <button onClick={() => handleButtonClick("4")} className="btn">
            4
          </button>
          <button onClick={() => handleButtonClick("5")} className="btn">
            5
          </button>
          <button onClick={() => handleButtonClick("6")} className="btn">
            6
          </button>
          <button
            onClick={() => handleButtonClick("-")}
            className="btn bg-blue-500 text-white"
          >
            -
          </button>
          <button onClick={() => handleButtonClick("7")} className="btn">
            7
          </button>
          <button onClick={() => handleButtonClick("8")} className="btn">
            8
          </button>
          <button onClick={() => handleButtonClick("9")} className="btn">
            9
          </button>
          <button
            onClick={() => handleButtonClick("*")}
            className="btn bg-blue-500 text-white"
          >
            *
          </button>
          <button onClick={() => handleButtonClick("0")} className="btn">
            0
          </button>
          <button onClick={() => handleButtonClick(".")} className="btn">
            .
          </button>
          <button
            onClick={evaluateExpression}
            className="btn bg-blue-500 text-white"
          >
            =
          </button>
          <button
            onClick={() => handleButtonClick("/")}
            className="btn bg-blue-500 text-white"
          >
            /
          </button>
          <button
            onClick={clearExpression}
            className="btn bg-red-500 text-white col-span-2"
          >
            Clear
          </button>
        </div>
      </div>
    </div>
  );
}

export default Calculator;
