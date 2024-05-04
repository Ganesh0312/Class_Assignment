import React, { useState } from "react";

function Counter() {
  const [count, setCount] = useState(0);

  const increment = () => {
    setCount(count + 1);
  };

  const decrement = () => {
    setCount((prevCount) => prevCount - 1);
  };

  return (
    <>
      <div>
        <h2>Counter</h2>
        <span>{count}</span> <br />
        <br />
        <button onClick={decrement}>Decrement </button>
        <button onClick={increment}>Increament</button>
      </div>
    </>
  );
}

export default Counter;
