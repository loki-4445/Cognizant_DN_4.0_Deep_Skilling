import React from 'react';
import Cart from './Cart';
export class OnlineShopping extends React.Component{
    render(){
        const CartInfo=[{itemname:"Laptop",price:800000},
            {itemname:"TV",price:220000},
            {itemname:"Washing Machine",price:100000},
            {itemname:"Mobile",price:900000},
            {itemname:"Fridge",price:410000}
        ]
        return (
            <div className="mydiv">
                <h1>Items Ordered :</h1>
                <Cart item={CartInfo}/>
            </div>
        )
    }
}