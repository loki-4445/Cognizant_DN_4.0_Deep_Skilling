// src/Components/IndianPlayers.js
import React from 'react';

const IndianPlayers = () => {
  const OddTeam = ["Virat", "Hardik", "Dhoni", "Gill", "Bumrah"];
  const EvenTeam = ["Rohit", "Jadeja", "Shami", "Kuldeep", "Surya", "KL Rahul"];

  const [team1, team2] = [OddTeam, EvenTeam]; // Destructuring

  const T20Players = ["Virat", "Rohit", "Gill"];
  const RanjiTrophy = ["Pujara", "Rahane", "Iyer"];

  const mergedPlayers = [...T20Players, ...RanjiTrophy]; // Spread/Merge

  return (
    <div>
      <h2>Odd Team Players</h2>
      <ul>
        {team1.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Even Team Players</h2>
      <ul>
        {team2.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Merged Players List (T20 + Ranji)</h2>
      <ul>
        {mergedPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
