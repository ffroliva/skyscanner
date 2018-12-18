import React from 'react';

import './Destination.css';

class Destination extends React.Component {
    constructor(props) {
      super(props);
    }

    travellersLabel() {
        return this.props.adults === 1 ? '1 traveller' : this.props.adults + 'travellers';
    }

    render() {
        return (
            <div className="container-fluid">
                <div id="destination" className="row">
                    <div className="col-xs-12">
                        <h1>
                            <span className="right5">{this.props.codeOrigin}</span>
                            <span className="glyphicon glyphicon-arrow-right icon-arrow-right"></span>
                            <span className="left5">{this.props.codeDestination}</span>
                        </h1>
                    </div>
                    <div className="col-xs-12 travellers">{this.travellersLabel()}, {this.props.cabinClass}</div>
                </div>
            </div>
        )
    }
}

export default Destination;
