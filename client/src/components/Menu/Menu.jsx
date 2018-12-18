import React from 'react';

import logo from './logo.svg';
import './Menu.css';


const Menu = () => (
<nav id="myNavbar" className="navbar navbar-default navbar-margin-bottom-0 backgroud-color-white" role="navigation">
    <div className="container-fluid">
        <div className="navbar-header">
            <button type="button" className="navbar-toggle" data-toggle="collapse" data-target="#navbarCollapse">
                <span className="sr-only">Toggle navigation</span>
                <span className="icon-bar"></span>
                <span className="icon-bar"></span>
                <span className="icon-bar"></span>
            </button>
            <a className="navbar-brand" href="#"><img className="logo-image" alt="Skyscanner" src={logo} /></a>
        </div>
        <div className="collapse navbar-collapse" id="navbarCollapse">
            <ul className="nav navbar-nav">
                <li className="active"><a href="/">Home</a></li>
            </ul>
        </div>
    </div>
</nav>
);

export default Menu;
