import React ,{Component} from 'react';
import Card from '@material-ui/core/Card';
import CardActions from '@material-ui/core/CardActions';
import CardContent from '@material-ui/core/CardContent';
import CardMedia from '@material-ui/core/CardMedia';
import Grid from '@material-ui/core/Grid';
import Avatar from '@material-ui/core/Avatar';
import Popover from '@material-ui/core/Popover';
import { Nav,Navbar,NavDropdown,Form,FormControl,Button } from 'react-bootstrap';
import Typography from '@material-ui/core/Typography';
import { makeStyles } from '@material-ui/core/styles';
import Container from '@material-ui/core/Container';
import Link from '@material-ui/core/Link';
import MyNavbar from './MyNavbar';

import './App.css';
import {
  BrowserRouter,
  Route,
  Switch
} from 'react-router-dom';
import Newarrivals from './Newarrivals.js';

import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';

function Copyright() {
  return (
    <Typography variant="body2" color="textSecondary" align="center">
      {'Copyright © '}
      <Link color="inherit" href="https://material-ui.com/">
     Poseid
      </Link>{' '}
      {new Date().getFullYear()}
      {'.'}
    </Typography>
  );
}

function handleClick(event) {
  event.preventDefault();
  console.info('You clicked a breadcrumb.');
}

const useStyles = makeStyles((theme) => ({
  icon: {
    marginRight: theme.spacing(2),
  },
  homecoverdiv: {
    display:'flex',
    alignItems:'center',
    justifyContent:'center',
    width:'100%',
  },
  homecover: {
    width:'100%',
  },
  banner: {
    margin: '100px 0px',
    width:'100%',
  },
  heroContent: {
    backgroundColor: theme.palette.background.paper,
    padding: theme.spacing(8, 0, 6),
    backgroundColor: '#000000',
  },
  heroButtons: {
    marginTop: theme.spacing(4),
    color:'#000000',
  },
  cardGrid: {
    paddingTop: theme.spacing(8),
    paddingBottom: theme.spacing(8),
  },
  card: {
    height: '100%',
    display: 'flex',
    flexDirection: 'column',
  },
  cardMedia: {
    paddingTop: '56.25%', // 16:9
  },
  cardContent: {
    flexGrow: 1,
  },
  footer: {
    backgroundColor: theme.palette.background.paper,
    padding: theme.spacing(6),
  },
  iconColor: {
    backgroundColor:'#ebebeb',
  },
  GoButtons: {
    borderColor:'#ebebeb',
    color:'#ebebeb',
    '&:hover': {
      backgroundColor:'#ebebeb',
      borderColor:'#0B121E',
      color:'#0B121E'
   },
   box: {
    width:'100px'
   },
   disocuntBox: {
    display:'flex',
   },
  },
}));

const cards = [1, 2, 3, 4, 5, 6, 7, 8, 9];

export default function Home() {
  const classes = useStyles();
 
  const useEffect = () => {
    document.title = "home";
  };
  
  const [anchorProfile, setAnchorProfile] = React.useState(null);

  const handleProfileClick = (event) => {
    setAnchorProfile(event.currentTarget);
  };

  const handleProfileClose = () => {
    setAnchorProfile(null);
  };

  return (

    <React.Fragment>
      <main>
        {/* Hero unit */}
        <div className={classes.heroContent}>
          <Container maxWidth="sm">
            <div className="homecoverdiv">
              <img src={require('./img/cover.png')} alt="Background" className={classes.homecover} />
            </div>
            <div className={classes.heroButtons}>
              <Grid container spacing={2} justify="center">
                <Grid item>
                  <Button className={classes.GoButtons} variant="contained" color="primary" href="/Newarrivals">
                    ENTER
                  </Button>
                </Grid>
              </Grid>
            </div>
          </Container>
          <Container maxWidth="md">
            <Grid>
            <a href="/Newarrivals">
              <img src={require('./img/banner.png')}  alt="banner" className={classes.banner} />
            </a>
            </Grid>
          </Container>
        </div>
      </main>
      {/* Footer */}
      <footer className={classes.footer}>
        <Typography variant="h6" align="center" gutterBottom style={{fontFamily:"Baskerville Old Face"}} >
          "The pursuit of future beauty."
        </Typography>
        <Typography variant="subtitle1" align="center" color="textSecondary" component="p">
          CSIE, NTUT
        </Typography>
        <Copyright />
      </footer>
      {/* End footer */}
    </React.Fragment>
  );
}