// JavaScript source code
import logoInterface from '../../images/logoUserInterface.png';
import userImagen from '../../images/userImage.png';
import homeIcon from '../../images/homeIcon.png';
import accIcon from '../../images/userIcon.png';
import bankIcon from '../../images/bankIcon.png';
import notificationIcon from '../../images/notificationIcon.png';
import logOutIcon from '../../images/logOutIcon.png';

import { UserSettings } from '../UserSettings/UserSettings.js'

import './UserInterface.css';

import {
    BrowserRouter as Router,
    Switch,
    Route,
    Routes,
    Link
} from "react-router-dom";

export function UserInterface() {

    const data = {
        name: "Edgar J",
        user: "Katharina_Bernier",
        account: 
            { balance: 1681.37 }
        
    };
    return (
        <div name = "container">
            <tr className="top">
                <th>
                    <img src={userImagen} />
                    <p>{data.name}</p>
                    <p>@{data.user}</p>

                </th>
                <th colspan="4">
                    <img src={logoInterface} className="headerImage" ></img>
                </th>
            </tr>
            <tr>
                <td>
                    <div className="bankInfo">
                        <p><b>${data.account.balance}</b></p>
                        <p>Account Balance</p>
                    </div>

                    <ul>
                        <li> <img src={homeIcon} /> <Link to="">Home</Link> </li>
                        <li> <img src={accIcon} /> <Link to="/settings">My Account</Link> </li>
                        <li> <img src={bankIcon} /> <Link to="">Bank Account</Link> </li>
                        <li> <img src={notificationIcon} /> <Link to="">Notifications</Link> </li>
                        <li> <img src={logOutIcon} />  <Link to="">Logout</Link></li>
                    </ul>
                </td>
                <td colspan="4">
                    
                            
                                <UserSettings/>
                            
                    
                </td>
            </tr>
        </div >
    )
}
