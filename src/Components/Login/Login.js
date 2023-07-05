import logo from '../../images/logo192.png';
import './Login.css';
//var bcrypt = require('bcrypt');
export function Login() {
//export const Login = () => {
    return (
        <div class="container">

            <img src={logo} className="Login-logo" />
            
                <h1>Login</h1>
                <input type="text" id="email" placeholder="Username *" className="draw-border"></input>
                <br></br>

                <input type="password" id="pass" placeholder="Password *" className="draw-border"></input>
                <br>
                </br>
                <button onClick={CheckUser} >LOGIN</button>
            
        
        </div>
        
    )
}
function CheckUser() {
    
    console.log(document.getElementById("pass").value);
    var email = document.getElementById("email").value;
    var passWord = document.getElementById("pass").value;
    //var passHash = hash(passWord);
    
}

/*function hash(str) {
    var cript = bcrypt.genSaltSync(10);
    var hash = bcrypt.hashSync(str, cript);
    return hash; 
}*/