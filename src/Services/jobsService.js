import axios from 'axios'
export default class JobsService {
    getJobs() {
        return axios.get('http://localhost:8080/api/JobsAdvertisement/getAll')
    }
    getByPositionId(id){
        return  axios.get('http://localhost:8080/api/JobsAdvertisement/getByPositionID?id='+id)
    }
    addJob(values){
        console.log("asdas:" + values.cityName)
        return axios.post('http://localhost:8080/api/JobsAdvertisement/add'+values)
        
    }
}