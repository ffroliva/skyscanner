import React from 'react';

import './App.css';
import Destination from '../Destination';
import Menu from '../Menu/Menu';
import Filter from '../Filter';
import FlightsFound from '../FlightsFound';


class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {};
  }

  async componentDidMount(){
    console.log('fetching results from server...');
    try {
      const res = await fetch('http://localhost:8080/fetchNextMondayFlights');
      const pricing = await res.json();
      this.setState({ pricing : pricing });
      console.log(pricing);
    } catch (error) {
      console.error(error);
    }
  }

  codePlace = (idPlace) => {
    return this.state.pricing.Places.find(x => x.Id == idPlace).Code;
  }

  renderMain(){
    const query = this.state.pricing.Query;
    return (
    <div>
      <Menu/>
      <main>
        <Destination adults={query.Adults} 
                     cabinClass={query.CabinClass} 
                     codeOrigin={this.codePlace(query.OriginPlace)} 
                     codeDestination={this.codePlace(query.DestinationPlace)}
                     />
        <Filter/>
        <FlightsFound pricing={this.state.pricing}/>
      </main>
    </div>
    );
  }

  renderLoading() {
    return <span>Loading skyscanner full stack recuitmet test...</span>
  }

  render() {
    const  pricing = this.state.pricing;
    return pricing ? this.renderMain() : this.renderLoading();
  }
}

export default App;
