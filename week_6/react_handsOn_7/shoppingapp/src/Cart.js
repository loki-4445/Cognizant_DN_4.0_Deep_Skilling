import React from 'react';
import './Cart.css'
class Cart extends React.Component {
    render() {
        return (
            <table>
                <tbody>
                    {this.props.item.map((item, index) => (
                        <tr key={index}>
                            <td>{item.itemname}</td>
                            <td>{item.price}</td>
                        </tr>
                    ))}
                </tbody>
            </table>
        );
    }
}

export default Cart;
