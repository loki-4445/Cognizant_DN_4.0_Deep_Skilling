import React,{Component} from 'react'
import Post from './Post'
class Posts extends Component{
    constructor(props){
        super(props)
        this.state={
            posts:[],
            error:null
        }
    }
    loadPosts=()=>{
        fetch('https://jsonplaceholder.typicode.com/posts')
        .then(res=>res.json())
        .then(data=>{
            const postObjects = data.map(p => new Post(p.userId, p.id, p.title, p.body));
        this.setState({ posts: postObjects });
        })  .catch(error => this.setState({ error }));
  };

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    alert('An error occurred: ' + error);
  }

  render() {
    const { posts } = this.state;

    return (
      <div>
        <h1>Blog Posts</h1>
        {posts.length > 0 ? (
          posts.map(post => (
            <div key={post.id}>
              <h3>{post.title}</h3>
              <p>{post.body}</p>
              <hr />
            </div>
          ))
        ) : (
          <p>Loading posts...</p>
        )}
      </div>
    );
  }
}
export default Posts