import logo from './logo.svg';
import './App.css';

function App() {
  const officeList = [  // fixed typo: offficeList → officeList
    { Name: "DBS", Rent: 50000, Address: "Chennai", img: "https://cdn.sanity.io/images/uqxwe2qj/production/62db3c671745e98cb27690dff96f8033d2bb7f35-2048x1010.jpg?q=80&auto=format&fit=clip&w=1440" },
    { Name: "Regus", Rent: 65000, Address: "Bangalore", img: "https://qdesq.imagekit.io/img/tr:n-listing_image_hq/image/upload/v1579507319/rnrxqcbatzfzmzj7d48c.webp" },
    { Name: "WeWork", Rent: 55000, Address: "Hyderabad", img: "https://qdesq.imagekit.io/img/tr:n-listing_image_hq/image/upload/v1608703156/aea4o5w8woxv5hnqaadr.webp" }
  ];

  const getRentClass = (rent) => { // fixed typo: getRentClas → getRentClass
    return rent <= 60000 ? 'textRed' : 'textGreen';
  };

  return (
    <div className="App">
      {officeList.map((office, index) => (
        <div key={index} style={{ border: "1px solid #ccc", padding: "10px", margin: "10px" }}>
          <img src={office.img} alt="Office Space" width="25%" height="25%" />
          <h1>Name: {office.Name}</h1>
          <h3 className={getRentClass(office.Rent)}>Rent: Rs. {office.Rent}</h3>
          <h3>Address: {office.Address}</h3>
        </div>
      ))}
    </div>
  );
}

export default App;
