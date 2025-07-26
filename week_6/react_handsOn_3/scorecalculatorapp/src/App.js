import logo from './logo.svg';
import './App.css';
import CalculateScore from '../src/components/CalculateScore';
function App() {
  return (
    <div className="App">
      <CalculateScore name="Steeve" school="Greenwood High" total={284} goal={3} />
    </div>
  );
}

export default App;
