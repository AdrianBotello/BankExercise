import logo from '../../images/logo192.png';
import './SignUp.css';

export function SignUp() {
    return (
        <body>
            <div class="box">
                <form>
                    <img src={logo} className="Sign-logo" />
                
                    <h1>Sign Up</h1>

                    <label name="fstName" for="draw-border" class="label-helper">First Name *</label><br/>
                    <input type="text" name="fstName" placeholder="First Name *" className="draw-border" id="draw-border"></input>
                    <br/>

                    <input type="text" name="lstName" placeholder="Last Name *" className="draw-border"></input>
                    <br/>
                    <input type="text" name="email" placeholder="Username *" className="draw-border"></input>
                    <br/>
                    <input type="password" name="pass" placeholder="Password *" className="draw-border"></input>
                    <br/>

                    <input type="password" name="repPass" placeholder="Confirm Password *" className="draw-border"></input>
                    <br/>

                    <button onClick={SignUpSendInfo}>SIGN UP</button>
                </form>
            </div>
            

        </body>

    )
}
function SignUpSendInfo() {
    console.log("Test");
}