import logo from './logo.svg';
import './App.css';
import axios from 'axios';
import { useState, useEffect } from 'react';
import Header from './components/header/Header';

function App() {

  const[hotels, setAllHotels] = useState();

  const getAllHotels = async() => {
    try{
      const response = await axios.get('http://localhost:8080/hotel');
      
      setAllHotels(response.data);
    }
    catch(err) {
      console.log(err);
    }
  }

  useEffect(() =>{
    getAllHotels();
    console.log(hotels);
  }, [])

  return (
    <div className="App">
      <Header/>

    </div>
  );
}

export default App;
