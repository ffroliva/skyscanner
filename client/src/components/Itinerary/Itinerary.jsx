import React from "react";

import "./Itinerary.css";
import Leg from "../Leg/Leg";
import Price from "../Price";

class Itinerary extends React.Component {
  constructor(props) {
    super(props);
  }

  agentById = (id) => {
      return this.props.pricing.Agents.find(x => x.Id === id);
  } 

  render() {
      const itinerary = this.props.itinerary;
      const pricing = this.props.pricing;
      /**
       * Because I don't have further detains on how to operate the price options, 
       * for the sake of simplicity, I've fetched the first item of the array. 
       */
      const priceOption = itinerary.PricingOptions[0];
      const agent = this.agentById(itinerary.PricingOptions[0].Agents[0]);
      const outBoundLeg = this.props.pricing.Legs.find(x => x.Id === itinerary.OutboundLegId);
      const inBoundLeg = this.props.pricing.Legs.find(x => x.Id === itinerary.InboundLegId)
    return (
        <div className="row panel box-shadow--2dp fight-item">
          <Leg leg={outBoundLeg} places={pricing.Places} agent={agent} outbound="true" />
          <Leg leg={inBoundLeg}  places={pricing.Places} agent={agent} />
          <Price priceOption={priceOption} agent={agent}/>
        </div>
    );
  }
}

export default Itinerary;
