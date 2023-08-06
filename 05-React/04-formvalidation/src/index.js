import React from 'react'
import {render} from 'react-dom';
import RegistrationForm from './RegistrationForm';

function App() {
    return (
        <div>
            <h2>Welcome to Form Validation</h2>
            <RegistrationForm/>
        </div>
    );
}

render(<App />, document.getElementById('root'));