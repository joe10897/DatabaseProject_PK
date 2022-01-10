import React, { Component } from 'react';
import './App.css';
import 'bootstrap/dist/css/bootstrap.css';
import { connect } from 'react-redux';
import { withRouter } from "react-router-dom";
import { Container, Row, Col, Jumbotron, Card, CardImg, CardBody ,  CardTitle, CardSubtitle, CardText, Badge } from 'reactstrap';
import { Form,FormControl,Button } from 'react-bootstrap';
import ProductItem from './ProductItem';

class Jacket extends Component {
  constructor(props){
    super(props)
    this.state = {
      itemID:0,
      shoppingCart:{},
      temp:"",
      searchname:"",
    }
    this.addToCart = this.addToCart.bind(this)
    this.handleChange = this.handleChange.bind(this)
    this.gosearch = this.gosearch.bind(this)
  }

  addToCart(){
    console.log(this.state.itemID)
    localStorage.setItem("shoppingCart", JSON.stringify(this.shoppingCart));
  }
  
  handleChange = e => {
    this.setState({ temp: e.target.value})
    console.log(this.state.temp)
  };

  gosearch() {
    this.setState({ searchname: this.state.temp})
    console.log(this.state.searchname)
  }

    render() {
        return (
            <div style={{backgroundColor:"#000000",margin:"-6px 0"}}>
                <div style={{margin:'10px' , display: 'flex',  justifyContent:'flex-end ', alignItems:'center'}}>
                    <Form inline>
                    <FormControl type="text" placeholder="Search" onChange={this.handleChange} className="mr-sm-2" />
                        <Button variant="outline-dark" onClick={this.gosearch} >Search</Button>
                    </Form>
                </div>
                <Row style={{margin:'10px 100px' , display: 'flex',  justifyContent:'flex-end ', alignItems:'center'}}>
                {
                  this.props.ProductList.map((item,key) => {
                    if(item.category == "Jacket"){
                      if(this.state.searchname == "")
                      {
                        console.log(item.itemID)
                        return(
                        <ProductItem key={item.itemID} product={item}/>
                        )
                      }
                      else if (item.name.includes(this.state.searchname))
                      {
                          console.log(item.itemID)
                          return(
                          <ProductItem key={item.itemID} product={item}/>
                          )
                      
                      }
                      
                    }  
                  })
                }
                </Row>
            </div>
        );
    }

}

function mapStateToProps(state) {
    return {
      ProductList: state.ProductList
    }
  }
  
  export default connect(mapStateToProps,null)(withRouter(Jacket));