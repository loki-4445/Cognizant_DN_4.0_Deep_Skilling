// src/TrainerDetails.js
import React from 'react';
import { useParams } from 'react-router-dom';
import Trainers from './TrainersMock';

function TrainerDetail() {
  const { id } = useParams();
  const trainer = Trainers.find(t => t.trainerId === parseInt(id));

  if (!trainer) return <p>Trainer not found</p>;

  return (
    <div>
      <h2>Trainer Details</h2>
      <p><strong>ID:</strong> {trainer.trainerId}</p>
      <p><strong>Name:</strong> {trainer.name}</p>
      <p><strong>Email:</strong> {trainer.email}</p>
      <p><strong>Phone:</strong> {trainer.phone}</p>
      <p><strong>Technology:</strong> {trainer.technology}</p>
      <p><strong>Skills:</strong> {trainer.skills}</p>
    </div>
  );
}

export default TrainerDetail;
