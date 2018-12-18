import React from "react";

import "./Leg.css";

class Leg extends React.Component {
  constructor(props) {
    super(props);
  }

  placeById = (id) => {
    return this.props.places.find(x => x.Id === id);
  }

  flightTime = (sDate) =>{
      return String(sDate).substring(11,16);
  }

  flightDuration = (departureDate, arrivalDate) => {
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
    console.log(flightDuration);
    return flightDuration;
  }

  render() {
    const leg = this.props.leg;
    const outbound = this.props.outBound ? 'flight-back' : '';
    const classes = `row ${outbound}`;
    const origin =  this.placeById(leg.OriginStation);
    const destination = this.placeById(leg.DestinationStation);
    return (
        <div className="col-xs-12">
            <div className={classes}>
                <div className="col-xs-1">
                    <img src="img/EZ.png" className="img-rounded img-size-25" />
                </div>
                <div className="col-xs-2">
                    <div><h4>{this.flightTime(leg.Departure)}</h4></div>
                    <div><h4>{origin.Code}</h4></div>
                </div>
                <div className="col-xs-1">
                    <span className="glyphicon glyphicon-arrow-right arrow-right-flights" />
                </div>
                <div className="col-xs-2">
                    <div><h4>{this.flightTime(leg.Arrival)}</h4></div>
                    <div><h4>{destination.Code}</h4></div>
                </div>
                <div className="col-xs-6 pull-right">
                    <div className="fight-duration-time">{this.flightDuration(leg.Departure,leg.Arrival)}</div>
                    <div className="fight-stops">Direct</div>
                </div>
            </div>
        </div>
    );
  }
 
}


export default Leg;
