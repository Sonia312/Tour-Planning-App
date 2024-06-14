import React from "react";
import styled from "styled-components";

const Navbar = () => {
  return (
    <NavbarContainer>
      <nav className="navbar navbar-expand-lg">
        <a className="navbar-brand">
          <img src="tourplan\pictures\logo.png" alt="Bon Voyage Logo" />
        </a>
        <button
          className="navbar-toggler"
          type="button"
          data-toggle="collapse"
          data-target="#navbarNav"
          aria-controls="navbarNav"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span className="navbar-toggler-icon" />
        </button>
        <div className="collapse navbar-collapse" id="navbarNav">
          <ul className="navbar-nav">
            <li className="nav-item active">
              <a className="nav-link" href="#">
                Home
              </a>
            </li>
            <li className="nav-item">
              <a className="nav-link" href="#">
                New Trip
              </a>
            </li>
            <li className="nav-item">
              <a className="nav-link" href="#">
                Current Trip
              </a>
            </li>
            <li className="nav-item">
              <a className="nav-link" href="#">
                Past Trips
              </a>
            </li>
          </ul>
        </div>
      </nav>
    </NavbarContainer>
  );
};

const NavbarContainer = styled.div`
  background-color: white;
  nav {
    padding: 1%;
    padding-left: 1.5%;
  }
  .nav-item {
    padding: 10px;
  }
`;

export default Navbar;
