import React from 'react'
import './CalculateScore.css'
function CalculateScore(props) {
    const {name,school,total,goal}=props
    const perToDec=(ans)=>{
      return (ans.toFixed(2)+'%')
    }
    const calavg=(total,goal)=>{
      return perToDec(total/goal)
    }
  return (
 <div className='formatstyle'>
      <h2 style={{color:'brown'}}>Student Score</h2>
      <p className='Name'><strong>Name:</strong>{name}</p>
      <p className='School'><strong>School:</strong>{school}</p>
      <p className='Total'><strong>Total:</strong>{total}</p>
      <p className='Score'><strong>Average Score :</strong>{calavg(total,goal)}</p>
 </div>
  )
}

export default CalculateScore
