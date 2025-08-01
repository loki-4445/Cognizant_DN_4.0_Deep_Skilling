import React from 'react'

function ListOfPlayers() {
    const players=[
    { name: "Virat", score: 80 },
    { name: "Rohit", score: 75 },
    { name: "Hardik", score: 45 },
    { name: "Dhoni", score: 90 },
    { name: "Jadeja", score: 50 },
    { name: "Gill", score: 100 },
    { name: "Bumrah", score: 30 },
    { name: "Shami", score: 60 },
    { name: "Kuldeep", score: 40 },
    { name: "KL Rahul", score: 55 },
    { name: "Surya", score: 85 },

    ]
    const lowScore=players.filter(p=>
        p.score<70
    )
  return (
    <div>
        <h2>
            All Players
        </h2>
        <ul>
           {players.map((p,index)=>(
        <li key={index}>Player Name : {p.name} - <span>{p.score}</span></li>
           ))}
        </ul>
        <h2>Players with Score below 70</h2>
        <ul>
            {
                lowScore.map((p,index)=>(
                    <li key={index}>Name : {p.name} - <span>{p.score}</span></li>
                ))
            }
        </ul>
    </div>
  )
}

export default ListOfPlayers