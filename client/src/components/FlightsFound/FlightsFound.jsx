import React from "react";
import PropTypes from 'prop-types'

import "./FlightsFound.css";
import Itinerary from "../Itinerary/Itinerary";

class FlightsFound extends React.Component {
  constructor(props) {
    super(props);
  }

  render() {
    var elements=[];
    for(var i=0;i<this.props.pricing.Itineraries.length;i++){
      const itinerary = this.props.pricing.Itineraries[i];
      elements.push(
        <Itinerary itinerary={itinerary} pricing={this.props.pricing} key={i} />
        );
    }
    return (
        <div className="container-fluid">
          <div className="row">
            <div className="col-xs-12 flights">
                {elements}
            </div>
          </div>
        </div>
    );
  }
}

FlightsFound.propTypes = {
  pricing: PropTypes.object.isRequired,
};

export default FlightsFound;
