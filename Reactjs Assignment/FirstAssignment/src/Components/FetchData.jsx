import React, { useEffect, useState } from "react";

const FetchData = () => {
  const [data, setData] = useState([]);

  useEffect(() => {
    const fetchdata = async () => {
      try {
        const response = await fetch(
          "https://jsonplaceholder.typicode.com/posts"
        );
        const jsonData = await response.json();
        setData(jsonData);
      } catch (error) {
        console.warn(error.message);
      }
    };
    fetchdata();
  }, []);

  return (
    <>
      <h1>fetch Data</h1>
      {data.map((item, index) => (
        <div key={index}>
          <p>{item.title}</p>
        </div>
      ))}
    </>
  );
};

export default FetchData;
