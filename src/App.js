import './App.css';
import {
    BrowserRouter as Router,
    Route,
    Routes
} from "react-router-dom";
import { Login } from './Components/Login/Login.js';
import { SignUp } from './Components/SignUp/SignUp.js';
import { UserInterface } from './Components/UserInterface/UserInterface.js';

function App() {
  /*return (
      <div className="App">
          <SignUp />
      </div>
  );*/
  return (
      <div className="App">
      <Router>
          
              <Routes>
                  <Route path="/" element={<Login></Login>}></Route>
                  <Route path="/SignUp" element={<SignUp></SignUp>}></Route>
                  <Route path="/user" element={<UserInterface></UserInterface>}></Route>
              </Routes>
      </Router>
      </div>
  )
}

export default App;
