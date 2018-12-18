import React from "react";

import "./Leg.css";

class Leg extends React.Component {
  constructor(props) {
    super(props);
  }

  _placeById = (id) => {
    return this.props.places.find(x => x.Id === id);
  }

  _flightTime = (sDate) =>{
      return String(sDate).substring(11,16);
  }

  _flightDuration = (departureDate, arrivalDate) => {
    var flightDuration;
    var timeStart = new Date(departureDate);
    var timeEnd = new Date(arrivalDate);
    var timeDiff = timeEnd - timeStart;
    var minutes = Math.floor((timeDiff/1000)/60);
    var hour = Math.floor(minutes/60);
    if(hour > 0) {
        flightDuration = hour+'h';
    }
    var minutesFlight = minutes - (hour * 60);
    if(minutesFlight > 0) {
        flightDuration += ` ${minutesFlight}`;
    }
    return flightDuration;
  }

  _isDirectFlight = (segmentIds) => {
    return segmentIds.length === 1;
  }

  render() {
    const leg = this.props.leg;
    const outbound = this.props.outBound ? 'flight-back' : '';
    const classes = `row ${outbound}`;
    const origin =  this._placeById(leg.OriginStation);
    const destination = this._placeById(leg.DestinationStation);
    const agent = this.props.agent;
    return (
        <div className="col-xs-12">
            <div className={classes}>
                <div className="col-xs-1">
                    <img src={agent.ImageUrl} className="img-rounded img-size-25" />
                </div>
                <div className="col-xs-2">
                    <div><h4>{this._flightTime(leg.Departure)}</h4></div>
                    <div><h4>{origin.Code}</h4></div>
                </div>
                <div className="col-xs-1">
                    <span className="glyphicon glyphicon-arrow-right arrow-right-flights" />
                </div>
                <div className="col-xs-2">
                    <div><h4>{this._flightTime(leg.Arrival)}</h4></div>
                    <div><h4>{destination.Code}</h4></div>
                </div>
                <div className="col-xs-6 pull-right">
                    <div className="fight-duration-time">{this._flightDuration(leg.Departure,leg.Arrival)}</div>
                    <div className="fight-stops">{this._isDirectFlight ? 'Direct' : `${leg.SegmentIds.length} stops`}</div>
                </div>
            </div>
        </div>
    );
  }
}


export default Leg;
