import React from 'react';

import './Filter.css';

const Filter = () => (
    <div className="container-fluid">
        <div className="row top5 bottom5">
            <div className="col-xs-6">
                <a href="#" className="customLink"><span>Filter</span></a>
                <a href="#" className="customLink"><span className="left10">Sort</span></a>
            </div>
            <div className="col-xs-6 pull-right">
                <a href="#" className="customLink">
                    <span className="glyphicon glyphicon-bell"></span><span className="left5">Price alerts</span>
                </a>
            </div>
        </div>
    </div>
);

export default Filter;
