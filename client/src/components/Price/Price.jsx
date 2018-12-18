import React from "react";

import "./Price.css";

class Price extends React.Component {
  constructor(props) {
    super(props);
  }

  render() {
    return (
        <div className="col-xs-12">
            <div className="row">
                <div className="col-xs-6">
                    <div className="price">
                    <i className="fas fa-pound-sign right5" />{this.props.priceOption.Price}
                    </div>
                    <div className="company">{this.props.agent.Name}</div>
                </div>
                <div className="col-xs-6 pull-right select">
                    <button type="button" className="btn btn-primary btn-round" >Select</button>
                </div>
            </div>
        </div>
    );
  }
 
}


export default Price;
